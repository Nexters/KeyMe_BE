# Keyme


<br />

### 커밋 전략
gitmoji base
- 코드 추가 - ✨ 
- 코드 수정 - 🎨 
- 코드 삭제 - 🔥 
- 버그 수정 - 🐛
- 되돌리기 - ⏪
- 코드(설정, 문서, DB) 외 추가 및 수정 - 📝

<br />

### 브랜치 전략
git-flow base
- main
- develop
- feature/{이슈번호}
- bugfix/{이슈번호}
- hotfix/{이슈번호}

<br />

### 패키지 구조
글로벌 패키지 구조
```text
global
    ├── aspect
    ├── common
    │   └── event
    │      ├── message
    │      └── handler
    ├── config
    ├── filter
    ├── resolver
    └── security
```

각 도메인 패키지 내 구조
```text
{domain name}
    ├── application
    ├── dto
    │   ├── mapper (eventDto로 변환도 맡음)
    │   ├── request
    │   ├── response
    │   ├── internal
    ├── domain
    │   ├── model
    │   ├── repository
    │   └── service
    ├── enums
    ├── exceptions
    └── presentation
```


<br />

### Layer 의존관계

<br />

### 컨밴션
- `@Async` 어노테이션
  - `@Service` 클래스 내 비동기 처리가 필요한 메서드 단위로 작성
- DTO 클래스
  - 클라이언트의 요청 - `...Request`
  - 클라이언트에게 응답 - `...Response`
  - 서버가 외부서비스에게 받아오는 응답객체 - `...Response`
  - internal 객체 - `...Info`