# Lotto
- 로또 번호 개수는 1번부터 45번까지 존재한다.
- 소비자의 구입방법은 두가지가 있다.
    1. 6개 + 임의의 숫자 1개를 자동으로 부여받는 방법
    2. 6개를 수동으로 뽑고, 1개의 임의의 숫자를 받는 방법
- 로또 당첨번호는 랜덤으로 주어진다.
- 로또 등수
    1. 6개의 숫자 모두 맞추면 1등
    2. 5개의 숫자 + 임의 숫자 1개 맞추면 2등
    3. 5개의 숫자를 맞추면 3등
    4. 4개의 숫자를 맞추면 4등
    5. 3개의 숫자를 맞추면 5등
    6. 그 이하 꽝



시작하기 앞서 되새겨야할 부분들을 정리해보겠다.

## 객체지향 관점에서 TDD로 조화를 이룰 수 있는 방법

### 메시지 기반으로 객체를 선택하자.
메시지 기반으로 객체를 선택하면 협력, 자율적인 객체 구조가 저절로 따라온다고 했다.

### What/Who 사이클을 적용해보자.
먼저 무엇을 해야하는지 생각하고 난 후에 객체를 결정하자.

### 무엇을 해야하는지 생각했다면 적용하기 전에 테스트 코드를 작성하자.
천천히 하나씩 바꾸고 실행해보고 바꾸고 실행해보자.



# [테스트할 목록]
- ~~1~45번 로또 당첨번호를 랜덤으로 돌린다.~~
- ~~1~45번의 랜덤 번호를 가져온다.~~
- ~~1~45번의 공을 만든다. getBalls()~~
- ~~1~45번의 공을 섞는다.~~
- ~~1~45번의 공은 기계가 가지고 있어야 한다. 상태에 저장해두자.~~
- ~~가독성을 위해 기계에 공을 가져온다라는 이름 말고, 기계에 공을 넣는다고 하자.
  getBalls -> putBalls~~
- ~~machine에서 가지고 있는 balls는 외부에서 굳이 알 필요 없다.
  공을 넣기만 하고 리턴값으로 외부에 주지 말자.~~
- ~~machine을 쓰는 입장에서 machine이 당첨번호를 뽑는 내부동작에 대해 알필요 없다.
  machine 내부에서 동작할 수 있도록 메서드를 구현하자.~~
- ~~테스트환경에서 machine 객체 생성이 반복적이다. setup 메서드를 구현하자.~~
- ~~balls가 잘 섞였는지 테스트할 equals 함수가 필요함.
  테스트환경에서 숫자의 개수와 순서가 같은지 판단하는 메서드 생성~~
- ~~random으로 1~45번 중복값 없이 섞기~~
- ~~당첨번호 6개 숫자 뽑기~~
- ~~보너스 당첨번호 숫자 1개 뽑기~~
- ~~당첨번호 몇개 뽑는지를 machine 객체가 아는것이 맞는걸까?~~
- 이 모든 것을 진행할 행사 객체 만들기
- 규칙을 행사에 적용하기
- 규칙에는 로또의 규칙이 들어있다.
- ~~보너스 당첨번호 뽑기~~
- ~~정식 당첨번호와 보너스 번호는 변하지 않는 형식으로 돌려줄수는 없을까?~~
- 행사에서 당첨자 호명하기
- 소비자는 마트에서 로또를 구매한다. 그 말은 로또를 구매하면 소비자가 된다.
- ~~소비자는 수동인지 자동인지 말해줘야한다.~~
- ~~수동으로 로또를 사기전 omr카드를 달라고 해야한다.~~
- ~~omr카드를 주면서 수동 로또를 사야한다.~~
- ~~번호를 제대로 안찍은 orm카드를 주면 로또를 못산다.~~
- ~~번호 뽑는 기계가 public 해야 한다. vending machine에서 사용, store에서 사용~~
- ~~소비자가 omr카드를 주면 omr카드에 번호대로 로또를 준다.~~


### 순서
- 소비자에게 로또팔기 - 상인 (메시지 수신자)
- 무엇을 파는가 -> 로또
- 구입방법
  - 수동이면 소비자가 직접뽑고
  - 자동이면 기계에서 수동으로 뽑아 나옴
- 소비자입장에서는 로또를 사기 - 소비자 (메시지 송신자)
- 기계를 작동시켜서 당첨번호를 뽑아라. - 기계
- 당첨인을 호명하라. 

#### 이해를 돕기 위한 소비자-상인 구도
* 소비자: 로또 살게요.
* 상인: 수동으로 하시겠어요, 자동으로 하시겠어요?
* 소비자: 자동으로 할게요.
* 상인: 주문하신 로또 여깄습니다.
* 소비자: (로또를 가짐)

#### 이해를 돕기 위한 행사 진행 구도
* 행사 준비물: 기계
* 행사: 자, 행사 개최를 시작하겠습니다.
* 행사: 먼저 기계를 돌리겠습니다. 당첨번호 뽑겠습니다.
* 행사: 당첨자들을 호명하겠습니다.