소프트웨어 분석설계 프로젝트 요약정리

도서관 사서가 사용하는 도서관 어플리케이션
도서관은 이름이 있고, 엄청많은 책(title(1개),author(1이상), unique catalogue number(중복되지않는 분류번호))들을 수장하고 있다.
도서관에는 대출자(중복되지않는 이름(1개)(같은 이름 중복 불가))들이 등록되어있다. - 사전조건(이용하기 위해서는 등록을 해야함)
대출자는 한권의 책의 대출과 반납을 할수있다. - 한명의 이용자는 한권을 대출할 수 있다.
각각의 책의 대출과 반납은 사서가 반드시 기록해야한다.
그녀는 새로운 이용자를 등록(한번에 한명씩), 대출가능한 책을 오름차순 보여준다, 대출중인 책을 오름차순으로 보여준다.