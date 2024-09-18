## CHAPTER 3: Functions

### 작게 유지하라
함수는 작아야하며, 화면을 넘어서면 안된다. 100줄을 넘어서는 함수는 좋지 않다.

### 하나의 함수에는 하나의 행동
어떠한 함수는 하나의 행동만 해야한다. 만약 여러개의 동작이 있다면, 각각의 역할을 하는 함수를 모두 쪼개버려라.

### 하나의 함수에는 하나의 추상 레벨
HTML과 관련된 코드를 작성한다고 할 때, `.getHTML`과 같은 코드는 상당히 고수준이지만, `PathParser.render()`는 중간 정도, `.append()`는 저수준이다.

여러 수준의 코드가 한 곳에 몰려 있는 것은 좋지 않으며, 각각의 함수는 다음 단계의 추상화 함수로 자연스럽게 이어져야 한다.

### Switch
`switch` 구문을 작게 만드는건 힘들다. 대신, 다형성을 이용하는 것이 좋다.

`switch` 구문을 추상 팩토리를 이용해 감춰버리면 함수 자체는 짧게 유지하고, 실제 구현은 따로 만들 수 있다.

### 좋은 이름을 써라
함수의 이름은 함수가 무엇을 하는지 명확하게 나타내어야 한다.

### 매개 변수는 적어야 한다.
함수의 매개변수는 함수를 테스트하기 힘들고, 함수를 사용하는 자로 하여금 세부사항을 알도록 강제한다.

함수가 여러 개의 매개변수를 필요로 한다면, 그 매개변수를 묶어 하나의 타입으로 만드는 것이 좋다.

### 사이드이팩트를 없애라.
함수가 숨겨진 다른 작업을 하는 것은 좋지 않다.

함수가 매개변수에 수정을 가하는 것도 일종의 사이드이팩트이므로 좋지 않다.

### 예외를 추가해라
에러를 반환하는 것은 호출자가 에러를 처리하여야하므로 좋지 않다.

exception을 이용해서 try/catch 구문으로 이를 감싸게 하라.

(현대 프로그래밍 언어라면 Result나 Option과 같은 형식으로 에러를 반환할 수도 있을 것이다...)

### 비슷한 코드를 반복하지 마라
중복되는 코드는 유지보수하기 어렵다. 객체지향적 관점에서 중복을 제거할 수 있는 방법들을 살펴보아라.

### 구조적 프로그래밍
goto 쓰지 말라 제발
























