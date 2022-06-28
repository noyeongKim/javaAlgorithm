package test.test01;

public class Test01 {

    /**
     * 그냥 쓸데 없는 궁금증
     *
     * 전역 변수로 사용하는 변수 명을
     * 메소드 내 지역 변수로 사용 가능한가?
     *
     * 사용 가능하다면 무슨 이유 일까
     *
     * 결론적으로는 사용이 가능하고, 변수 별 유효범위가 다르고
     * 다른 유효범위의 변수를 사용할 때는 변수를 호출하는 방식에서 차이가 있기 때문.
     *
     * 자바에서는 변수의 유효범위가 지정된다.
     * 이 유효범위를 나눠서 부르는 명칭이 전역/지역 변수로 나뉘며
     *
     * 지역변수 : 메소드(함수) 안에서만 유효
     * 전역변수 : 클래스 전역에 접근 가능. this로 호출 되며 클래스/인스턴스 변수를 포함한다.
     *
     * 기본적으로 선언의 위치가
     *
     * 전역변수 - 클래스 (메모리 - 클래스변수 : 메서드 / 인스턴스변수 : 힙)
     * 지역변수 - 메소드(함수)내 (메모리 - 스택)
     *
     * 이기도 하고, 각 변수의 할당 메모리 영역도 다르기 때문에
     * 지역 - 전역변수간의 변수명의 중복은 코드 작성에서 문제가 되지 않는다.
     *
     * 다만, 코드 구현시 지역, 전역 변수명을 같게 했을 경우에는 어떤 로직에서 어떤 영역의 변수 값이 필요한지는
     * 코더 스스로 알고 있어야 하며,
     * 다른 작업자의 오해를 줄이기 위해서는 되도록 변수명은 구분해서 사용하는것이 좋다고 생각.
     * (여의치 않은 경우에는 사용 가능하지만 그럴일이 있나 싶기도 하다)
     */

    public static void main(String[] args) {
        TestVariable testVariable = new TestVariable();


        testVariable.createVariable();

        testVariable.callVariable();


        testVariable.setI(30);


        testVariable.createVariable();

        testVariable.callVariable();

    }


}


class TestVariable {
    private Integer i;  // 클래스 전역 변수
    private static final Integer j = 23;    // 인스턴스 전역 변수

    public TestVariable() {
    }

    // 클래스 전역 변수 값 세팅
    public void setI(Integer i) {
        this.i = i;
    }

    // 전역변수와 이름이 같은 지역 변수 생성 및 출력
    public void createVariable() {
        Integer i = 20;
        Integer j = 33;

        System.out.println("local i val :: " + i);
        System.out.println("local j val :: " +j);

        System.out.println("global i val :: " +this.i);
        System.out.println("global j val :: " + this.j);
    }

    // 전역 변수 출력
    public void callVariable() {
        System.out.println("global i val :: " +i);
        System.out.println("global j val :: " +j);

    }
}