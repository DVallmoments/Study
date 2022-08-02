CSS
==========================
## CSS
### 그리드 레이아웃
반응형 웹 디자인을 사용하기위해 웹 문서의 요소를 재비치 할 때 웹사이트의 화면을 여러 개의 칼럼으로 나눈 후 웹 요소를 배치

* 특징
1. 시각적으로 안정된 디자인
2. 업데이트가 편한 웹 디자인 구성
3. 요소를 자유롭게 배치

* 제작법
#### 플렉스 박스 레이아웃
> 그리드 레이아웃을 기본으로 각 박스를 원하는 위치에 따라 배치
> 여유공간의 활용도가 높음, 수평이나 수직 중 하나를 주축으로 배치

##### 플렉스 박스 레이아웃 속성
display : { flex | inline-flex }
> 배치 요소 들을 감싸는 부모 요소를 플렉스 박스 방식으로 동작 시킬 때 사용

flex-direction : { row | row-reverse | column | column-reverse }
> 플렉스 항목의 배치를 위해 주축과 방향을 지정

flex-wrap : { nowrap | wrap | wrap-reverse }
> 플렉스 항목을 한줄 또는 여러줄 배치

flex-flow : { row wrap | row nowrap }
> 플렉스 배치 방향과 여러 줄 배치를 한번에 지정

justify-content : { flex-start | flex-end | center | space-between | space-around }
> 플렉스 항목을 주축 방향으로 배치할 때 배치 기준

align-items, align-self : { flex-start | flex-end | center | baseline | stretch }
> 교차축을 기준으로 하는 배치 방법 조절, 특정 항목만 정렬 하고싶다면 self 사용

align-content : { flex-start | flex-end | center | space-between | space-around | stretch }
> 플렉스 항목이 여러줄로 표시될 때 교차 축 기준의 배치 방법 지정

#### CSS 그리드 레이아웃
> 주축의 개념 없이 배치, 레고블럭을 끼우는듯한 요소 배치
> 행과 열로 화면을 구성하고 행 과 열 사이의 여백을 조절

* fr단위
행/열의 크기를 지정할 때 상대적인 크기를 지정하는 fr단위를 사용

##### CSS 그리드 레이아웃 속성
display : { grid | inline-grid }
> 배치 요소들을 감싸는 부모 요소를 그리드 컨테이너로 지정

grid-template-columns : 그리드 컨테이너 안의 열 갯수 및 너비 값
> 열의 크기와 개수 지정
* repeat()
> 값의 반복을 여러번 할 때 사용
* auto-fill
> 열의 최소 너비까지만 표시하고 남는 공간은 유지함
* auto-fit
> 남는 공간 없이 열을 꽉 채움

grid-template-rows : 그리드 컨테이너 안의 행 갯수 및 너비 값
> 행의 크기와 개수 지정

* 그리드 라인을 사용한 배치
![image](https://user-images.githubusercontent.com/96763658/182342443-d069d190-825d-402c-aded-6ab8e2ca7896.png)

* 템플릿 영역을 생성한 배치
![image](https://user-images.githubusercontent.com/96763658/182342590-dad8b343-c061-4ef3-87f4-991e030a6e43.png)

### 웹 문서와 자바 스크립트
웹 문서 안에 자바 스크립트 작성
> 가독성을 위하여 \</body> 태그 앞에 \<script>\</script>사이에 소스 작성

외부 스크립트 파일 연결해서 작성
> \<script src="외부 스크립트 파일 경로">\</script>

#### 간단한 입출력 방법
* 알림 창 출력
alert (메세지)
> 확인 버튼이 있는 메세지 창 표시

* 확인 창 출력
cofirm (메세지)
> 확인과 취소 버튼이 있는 창 표시, 클릭하는 버튼에 따라 프로그램 동작

* 프롬프트 창에서 입력받기
prompt ("메세지", "기본값")
> 사용자 입력 값을 가져와 프로그램에서 사용

* 괄호 안의 내용 표시
document.write()
> 괄호 안에 큰 따옴표 사이에 입력한 내용은 웹 브라우저 화면에 그대로 표시

* 간단한 입출력 방법
console.log()
> 괄호안의 내용을 콘솔 창에 표시

## 자바스크립트
기본적으로 자바와 내용이 같음

* 자바스크립트 데이터 유형 자동 변환
> 변수의 데이터 유형이 중간에 바뀔 수 있기 때문에 문제가 발생 할 수 있음
