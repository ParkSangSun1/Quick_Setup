# 매뉴얼
## 내 프로젝트에 적용하는 방법

### 권장사항
- Android Studio Arctic Fox
- 테스트 버전
## ![image](https://user-images.githubusercontent.com/67040465/146757408-56e4bfb7-bbf2-440e-a746-6bb184a8caed.png)
<br>

### Fork
- 우측 화면에 Fork를 누르고 원하는 곳에 Fork한다
- Fork를 완료한 자신의 Repository에서 이름은 Rename한다
- 원하는 형식의 Branche를 남겨두고 나머지 Branche는 삭제한다
- Android Studio에 clean 한다, 이때 저장파일 이름은 원하는 이름으로 변경한다
- Android Studio에서 Settings.gradle파일에서 rootProject.name을 원하는 이름으로 변경한다
- 패키지 이름을 원하는 이름으로 변경한다
- app_name을 원하는 이름으로 변경한다
- build.gradle(Module)에서 applicationId를 원하는 이름으로 변경한다
<br>

### Clean
- 우측 화면에 Code를 누르고 주소를 복사한다
- 자신이 사용할 Repository를 생성한다
- Android Studio에서 clean 한다, 이때 저장파일 이름은 원하는 이름으로 변경한다
- 원하는 Branche를 선택후 Checkout한다
- Android Studio에서 Settings.gradle파일에서 rootProject.name을 원하는 이름으로 변경한다
- 패키지 이름을 원하는 이름으로 변경한다
- app_name을 원하는 이름으로 변경한다
- - build.gradle(Module)에서 applicationId를 원하는 이름으로 변경한다
- Git Remotes에 있는 기존 주소를 삭제하고 자신이 사용할 Repository 주소를 넣는다
- 새로운 Branche를 만드는겸 모든 내용을 Push한다

<br><br>
## 각각의 브랜치 설명
#### 모든 브랜치는 Coroutine 사용을 기준으로 만들어졌습니다
# <br>
### Mvvm branche -> mvvm 디자인 패턴을 적용할수 있는 구조
##### app
![image](https://user-images.githubusercontent.com/67040465/145801681-f17aab06-4619-4163-96de-232cbbd8acaa.png)'
##### 블로그 설명
##### https://asuhdevstory.tistory.com/63
<br>

### Clean_architecture_one branche -> mvvm 디자인 패턴에 clean architecture를 지향한 구조
##### 전체 모듈 구조
##### ![image](https://user-images.githubusercontent.com/67040465/145914910-d1c95b1b-73d1-4499-9f91-964702fc3ca1.png)

##### app
##### ![image](https://user-images.githubusercontent.com/67040465/145915205-8a2ad4d8-7307-443c-8f96-6f6fbb6be75f.png)

##### presentation
##### ![image](https://user-images.githubusercontent.com/67040465/145915279-c748e9b5-86f7-4574-90a3-fa54247446f0.png)

##### domain
##### ![image](https://user-images.githubusercontent.com/67040465/145915345-533f5f02-d9a6-423f-a4e7-9f10fae0e95f.png)

##### data
##### ![image](https://user-images.githubusercontent.com/67040465/145915413-7cd75c0e-fed4-40aa-8897-5410dc4b7c85.png)

##### 블로그 설명
##### https://asuhdevstory.tistory.com/64
<br>

### Clean_architecture branche_two -> 앞에 one에서 presentation 모듈을 삭제하고 app으로 대체한 구조
##### 전체 모듈 구조
##### ![image](https://user-images.githubusercontent.com/67040465/146285064-4cbcf60b-50e8-4685-b992-c34be5d90940.png)

##### app
##### ![image](https://user-images.githubusercontent.com/67040465/146285095-f219cc81-e521-4d21-ad21-58974e9bd7ed.png)

##### domain
##### ![image](https://user-images.githubusercontent.com/67040465/145915345-533f5f02-d9a6-423f-a4e7-9f10fae0e95f.png)

##### data
##### ![image](https://user-images.githubusercontent.com/67040465/145915413-7cd75c0e-fed4-40aa-8897-5410dc4b7c85.png)

##### 블로그 설명
##### https://asuhdevstory.tistory.com/64
