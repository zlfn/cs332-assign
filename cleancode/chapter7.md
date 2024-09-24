## CHAPTER 7: Error Handling
### 오류 코드 대신 Exception 쓰라
* 개인적으로 이제 슬슬 try-catch 말고 그냥 언어에서 제공하는 `Result` 같은걸 반환하는 코드를 짰으면 좋겠다.
  잘 구조화된 오류코드는 오류를 파싱하는데 도움이 된다.
* catch 블록은 try에서 어떤 일이 일어나든 프로그램을 정상작동하도록 유지해야한다.
### 오류와 함께 맥락을 전달해라
* Typed Error 쓰자
### Null 반환하지 말라
* 예외도 던지지 말자 우리에겐 이제 `Option`이 있다
### Null 전달하지 말라
* Builder Pattern 쓰자
