## CHAPTER 6: Objects and Data Structures
### 데이터 추상화
* 객체는 추상화 뒤에 데이터를 숨기고, 메소드로 데이터를 조작한다. 데이터 구조는 데이터를 노출하지만 메소드는 없다.
* 데이터 구조를 사용하면 기존 구조를 변경하지 않고 새로운 기능을 추가할 수 있다. 객체지향 프로그래밍은 기존 기능을 변경하지 않고 새로운 클래스를 추가할 수 있다.

### The Law of Demeter
* 모듈은 조작하는 물체의 내부를 알면 안된다. 보통 캡슐화라고 하던가

### Data Transfer Objects
* 이건 코틀린에서 data class, 스칼라에서 case class를 이용한다. 다른 프로세스로 정보를 넘길때 사용한다.
* 특히 API에서 잘 문서화된 데이터를 반환해줬으면 좋겠다.
