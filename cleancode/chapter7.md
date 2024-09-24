## CHAPTER 7: Error Handling
### 오류 코드 대신 Exception 쓰라
* 고전적인 코드는 오류코드를 반환했고, Java나 C++은 `try-catch` 구문을 제공한다.
* 오류 코드 반환하는 대신 `throw`로 오류를 던지자
* catch 블록은 try에서 어떤 일이 일어나든 프로그램을 정상작동하도록 유지해야한다.
* 근데 개인적으로 이제 상황에 따라 try-catch 말고 그냥 언어에서 제공하는 Result Type을 반환하는 코드를 짰으면 좋겠다. 잘 구조화된 오류코드는 복구 가능한 오류를 파싱하는데 도움이 된다.
* https://en.wikipedia.org/wiki/Result_type
### 오류와 함께 맥락을 전달해라
* 각 예외는 오류의 원인과 위치를 파악할 수 있게 정보를 제공해야한다.
* Typed Error와 함께 적절한 에러 메시지를 주면 좋겠다. 평문 에러 메시지 그만
### Null 반환하지 말라
* 책에선 예외 던지라고 했지만 예외도 던지지 말자 우리에겐 이제 `Option`(`Optional` in Java/Kotlin), `Some`, `None`이 있다
* https://en.wikipedia.org/wiki/Option_type
### Null 전달하지 말라
* Optional parameter는 Builder Pattern 쓰자
