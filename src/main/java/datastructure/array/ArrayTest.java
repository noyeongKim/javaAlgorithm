package datastructure.array;

public class ArrayTest {

    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public final int ERROR_NUM = -999999999;

    public ArrayTest() {
        this.count = 0;
        this.ARRAY_SIZE = 10;
        this.intArr = new int[ARRAY_SIZE];
    }

    public ArrayTest(int size) {
        this.count = 0;
        this.ARRAY_SIZE = size;
        this.intArr = new int[size];
    }

    // 배열 요소 추가
    public void addElement(int num) {
        checkArraySize();
        this.intArr[count++] = num;
    }

    // 배열 요소 생성
    public void insertElement(int position, int num) {
        int i;

        checkArraySize();

        if (position < 0 || position > this.count) {
            System.out.println("insert Error");
            return;
        }

        for (i = count - 1; i >= position; i--) {
            this.intArr[i + 1] = this.intArr[i];
        }

        this.intArr[position] = num;
        this.count++;
    }

    // 배열 요소 삭제
    public int removeElement(int position) {
        int ret = ERROR_NUM;

        if (this.isEmpty()) {
            System.out.println("There is no element");
            return ret;
        }

        if (position < 0 || position >= this.count) {
            System.out.println("remove Error");
            return ret;
        }

        ret = this.intArr[position];

        for (int i = position; i < this.count - 1; i++) {
            this.intArr[i] = this.intArr[i + 1];
        }
        this.count--;
        return ret;
    }

    // 배열 사이즈 조회
    public int getSize() {
        return this.count;
    }

    // 배열 요소 존재 여부
    public boolean isEmpty() {
        if (this.count == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 배열 요소 조회
    public int getElement(int position) {
        if (position < 0 || position > this.count - 1) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + this.count + "개 입니다.");
        }
        return this.intArr[position];
    }

    // 배열 요소 콘솔 표시
    public void printAll() {
        if (this.count == 0) {
            System.out.println("출력할 내용이 없습니다");
            return;
        }

        for (int i = 0; i < this.count; i++) {
            System.out.println(this.intArr[i]);
        }
    }

    // 배열 요소 전체 삭제
    public void removeAll() {
        for (int i = 0; i < this.count; i++) {
            this.intArr[i] = 0;
        }
        this.count = 0;
    }

    // 배열 사이즈 체크
    void checkArraySize() {
        if (this.count >= this.ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }
    }
}
