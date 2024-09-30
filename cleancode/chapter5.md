## CHAPTER 5: Formatting
### 수직 재정렬
서로 관련된 코드라인은 수직으로 밀도가 높아야 한다.
```java
public class ReporterConfig {

	/**
	 * The class name of the reporter listener */
	private String m_className;

	/**
	 * The properties of the reporter listener */
	private List<Property> m_properties = new ArrayList<Property>();

	public void addProperty(Property property) { m_properties.add(property);
	}
```

```java
public class ReporterConfig {
  private String m_className;
  private List<Property> m_properties = new ArrayList<Property>();

  public void addProperty(Property property) {
    m_properties.add(property);
  }
}
```
두번째가 더 나은 코드이다.

### 수직 거리, 순서
* 변수는 가능한 한 가깝게 선언해야 한다.
* 필드는 클래스의 맨 위에 선언해야한다.
* 함수는 호출하는 함수가 더 위에 있어야 한다.

### 수평 재정렬
* 수평 공백을 통해 관련 있는건 붙히고, 관련 없는건 떨어트리자
```java
public class Example implements Base
{
  private   Socket      socket;
  private   inputStream input;
  protected long        requestProgress;

  public Expediter(Socket      s,
                   inputStream input) {
    this.socket =     s;
    this.input  =     input;
  }
}
```
이런건 어셈블리에서나 하라

### 팀의 규칙
* 팀의 프로그래머는 하나의 단일화된 정렬 규칙을 따라야 한다.
* 근데 보통 현대 언어는 언어에서 권장하는 스타일이 있다.
