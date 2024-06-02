package com.task.object.ch9;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        /*
        사실 개방 폐쇄 원칙은 런타임 의존성과 컴파일타임 의존성에 관한 이야기이다.
        런타임 의존성은 실행 시에 협력에 참여하는 객체들 사이의 관계
        컴파일 의존성은 코드에서 드러나는 클래스들 사이의 관계

        둘은 서로 다른 구조를 갖는다.
         */


        /*
        Factory는 도메인 모델에 속하지 않고 순수히 기술적인 결정이다

        시스템을 객체로 분해하는 두 가지 방식은
        - 표현적 분해 : 도메인에 존재하는 사물 또는 개념을 표현하는 객체들을 이용해 시스템을 분해
        종종 도메인 개념을 표현하는 객체에게 책임을 할당하는 것만으로 부족하는 경우가 생김

        - 행위적 분해 :
         */


        ServiceLocator.provide(new AmountDiscountPolicy());
        new Movie("아바타", Duration.ofMinutes(120),
                Money.wons(10000));

        /*
        그러나 위의 방법은 의존성을 알 수 없어 디버깅이 어렵고 단위 테스트 작성도 어렵다.
         */
    }
}
