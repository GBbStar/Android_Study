# Android_Study

# 레이아웃
  <details> 
  <summary> 목록 </summary>
  
  * 레이아웃 공통
    - xml 이해
      + 접두어
        + xmlns:android > 안드로이드 기본 SDK에 포함되어 있는 속성
        + xmlns:app > 프로젝트에서 사용하는 외부 라이브러리에 포함되어 있는 속성
        + xmlns:tools > 디자이너 도구 등에서 화면에 보여줄 때 사용. 앱에서는 보이지 않음(적용x)
    - 크기 단위
      + | 이름| 단위 표현| 설명 |
        | -- | -- | -- | 
        | px | 픽셀 | 화면 픽셀의 수|
        | dp 또는 dip | 밀도 독립적 픽셀 | 160dpi 화면을 기준으로 한 픽셀 <br/> 해상도에 비례하는 비슷한 크기로 보이게할때 사용 |
        | sp 또는 sip | 축척 독립적 픽셀 | 텍스트 크기 지정에 사용하는 단위, 글꼴의 설정에 따라 1sp당 픽셀수가 달라짐|
        | in | 인치 | 1인치로 된 물리적 길이 |
        | mm | 밀리미터 | 1밀리미터로 된 물리적 길이 |
        | em | 텍스트 크기 | 글꼴과 상관없이 동일한 텍스트 크기 표시|
    - 테두리, 마진, 패딩
      + 테두리선을 기준으로 테두리선의 바깥쪽 공간을 마진이라 함
      + 테두리선을 기준을 안쪽의 공간을 패딩이라 함
    - Context
      + 객체의 정보를 담고있는 객체. 구성 요소인 뷰에 대한 정보를 쉽게 확인하고 설정할 수 있도록 인자로 전달됨
      + 뷰 객체를 코드에서 만들 떄는 항상 Context 객체가 요구됨
    - 정렬
      + layout_gravity > 부모 컨테이너의 여유 공간에 뷰가 모두 채워지지 않아, 여유 공간이 생겼을 때 안에서 뷰를 어떻게 정렬할건지
      + gravity > 뷰 안에 표시하는 내용물들을 어떻게 정렬할 것인지
    - layout_weight
      + 부모 컨테이너에 남아 있는 여유 공간을 분할하여, 기존에 추가했던 뷰에 할당
      + 비율로 지정
  
  * 제약 레이아웃
    - 이해
      + 뷰의 크기와 위치를 결정할 때, 제약 조건을 사용
      + 제약 조건이란 뷰가 레이아웃 안의 다른 요소와 어떻게 연결되는지 알려주는 것
      + 제약 조건은 뷰의 연결점과 대상(타깃)을 연결하여 설정
      + 타킷은 1. 같은 부모 레이아웃 안에 들어있는 다른 뷰의 연결점, 2. 부모 레이아웃의 연결점, 3. 가이드라인 등이 될 수 있다
      + 연결점은 1. 위, 아래, 왼, 오른쪽, 2. 가로축 가운데, 세로축 가운데, 3. 베이스라인 등이 될 수 있다 
    - 가이드라인
      + 여러 개의 뷰를 일정한 기준 선에 정렬할 때 사용
      + 뷰처럼 화면에 추가할 수 있지만, 화면에 보이지 않음
  
  
  * 리니어 레이아웃
    - 이해
      + 박스 모델을 사용하는 레이아웃
      + 한쪽 방향으로 차례대로 뷰를 추가하며 화면을 구성함
      + 뷰가 차지할 수 있는 사각형 영역을 할당하여 구성
  
  * 상대 레이아웃
    - 이해
      + 부모 컨테이너나 다른 뷰와의 상대적인 위치를 이용해 뷰의 위치를 결정할 수 있는 레이아웃
      + 규칙 기반의 모델
      + 제약 레이아웃을 사용하게 되므로써, 권장하지 않음
    - 속성
      + 부모 컨테이너와의 상대적 위치 이용
        + layout_alignParentTop
        + layout_alignParentBottom
        + layout_alignParentLeft
        + layout_alignParentRight
        + layout_centerHorizontal
        + layout_centerVertical
        + layout_centerInParent
      + 다른 뷰와의 상대적 위치 이용
        + layout_above
        + layout_below
        + layout_toLeftOf
        + layout_toRightOf
        + layout_alignTop
        + layout_alignBottom
        + layout_alignLeft
        + layout_alignRight
        + layout_alignBaseline
        
  * 테이블 레이아웃
    - 이해
      + 각각의 행과 그 안에 여러 개의 열을 넣어 레이아웃을 구성
      + 격자 모양의 배열을 사용하여 화면을 구성하는 레이아웃
    - 핵심 태그 및 속성
      + TableLow 태그 > 한 행을 의미, 안에 여러개의 뷰가 들어가고 이들이 각각 열이 됨
      + stretchColumns 속성 > 가로방향으로 여유가 있다면, 그 여유공간을 채우도록 컬럼을 설정(ex> 0,1,2)
      + shrinkColumns 속성 > 부모 컨테이너의 폭에 맞추도록 각 열의 폭을 강제로 축소
      + layout_column 속성 > 칼럼 인덱스를 지정하여, 순서를 설정
      + layout_span 속성 > 뷰가 여러 칼럼에 걸쳐있도록 만드는 속성(ex> 2)
      
  * 프레임 레이아웃
    - 이해
      + 싱글 모델을 기반으로 한 레이아웃
      + 가장 상위에 있는 하나의 뷰 또는 뷰그룹만 보여줌
      + 여러 개의 뷰가 들어가면 중첩하여 쌓게됨.
      + 가장 단순하지만 여러 개의 뷰를 중첩한 후, 각 뷰를 전환하여 보여주는 방식으로 자주 사용
    - 핵심 속성
      + 가시성(visibility)
     
  * 스크롤 뷰
    - 이해
      + 추가된 뷰의 영역이 한눈에 보이지 않을 때 사용
      + 스크롤 뷰 안에 뷰를 넣으면 스크롤이 생김
      
    - 핵심 태그 및 속성
      + HorizontalScrollView 태그 > 수평 스크롤을 위한 스크롤 뷰
      + ScrollView 태그 > 수직 스크롤을 위한 스크롤  
  </details>
  
  
  
# 기본 위젯
  <details>
  <summary> 목록 </summary>
  
  * 기본 위젯
    - TextView
      + 속성
        + text
          ~~~
              android:text="여기에 사용자 이름을 입력하세요. 이름은 한 줄로 표시됩니다."
          ~~~
        + textColor
          + 일반적으로 #AARRGGBB 포맷을 이용(Alpha는 투명하지 않음-FF ~ 투명함 00까지)
          ~~~
              android:textColor="#FFFF0000"
          ~~~
        + textSize
          + sp단위 권장(단말의 해상도에 따라 글자의 크기를 일정한 크기로 보일 수 있게 하고, 폰트도 반영되기 떄문)
          ~~~
              android:textSize="40sp"
          ~~~
        + textStyle
          + 문자열의 스타일 속성 지정(normal, bold, italic ...)
          ~~~
              android:textStyle="bold"
          ~~~
        + typeFace
          + 문자열의 폰트 지정(normal, sans, serif, monospace ...)
          + 다른 폰트가 필요하다면 폰트를 앱에 추가하고 설정하면 됨
          ~~~
              android:typeface="serif"
          ~~~
        + maxLines
          + 텍스트뷰에서 표시하는 문자열의 최대 줄 수 설정
          + 한줄이 넘어가면 표시되지 않음
          ~~~
              android:maxLines="1"
          ~~~
        + autoLink
          + 문서에 포함된 웹페이지 주소나 이메일 주소를 링크 색상으로 표시, 누르면 바로 접속하거나 편집기를 띄워주는 기능을 설정
        
        + lineSpacingMultiplier
          + 줄 간격을 기본 줄 간격의 배수로 설정할 때 사용
          
        + lineSpacingExtra
          + 줄 간격을 여유 값으로 설정할 때 사용
          
        + capitalize
          + 글자, 단어, 문장 단위로 대소문자를 조절
          + characters, word, sentences ... 
          + 각각 기준으로 맨 앞 글자를 대문자로 바꿔줌
          

        
      + text 설정 
        + /app/res/values의 strings.xml파일에 작성한 문자열을 지정하는 방법을 권장
        + 레이아웃(xml)과 문자열 파일을 구분하는 것이 유용
        + 다국어 지원이라는 장점도 있음(단말의 설정에 따라 /app/res/values-??/strings.xml의 문자열이 표시됨)
        
    - Button
      + Normal Button
      + Check Box
        + 메서드
          + boolean isChecked()
          + void setChecked(boolean checked)
          + void toggle()
        + 리스너
          + void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
      + Radio Button
        + 메소드
          + boolean isChecked()
          + void setChecked(boolean checked)
          + void toggle()
        + 리스너
          + void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        + 라디오 그룹과 버튼으로 이루어져있다(하나 선택하면 나머지가 해제되도록 묶어줘야 함)
          ~~~
              <RadioGroup
                  android:id="@+id/radioGroup01"
                  android:layout_width="wrap_content"
                  android:layout_height="wrap_content"
                  android:layout_marginTop="20dp"
                  android:orientation="horizontal"
                  android:paddingLeft="10dp"
                  android:paddingRight="10dp">

                  <RadioButton
                      android:id="@+id/radio01"
                      android:layout_width="wrap_content"
                      android:layout_height="wrap_content"
                      android:text="남성"
                      android:textColor="#ff55aaff"
                      android:textSize="24sp"
                      android:textStyle="bold" />

                  <RadioButton
                      android:id="@+id/radio02"
                      android:layout_width="wrap_content"
                      android:layout_height="wrap_content"
                      android:text="여성"
                      android:textColor="#ff55aaff"
                      android:textSize="24sp"
                      android:textStyle="bold" />
              </RadioGroup>
          ~~~
    - EditText
      + 설명
        + 입력상자의 역할(사용자에게 값을 입력받음)
      + 속성
        + hint
          + 간단한 안내글 표시
          ~~~
              android:hint="이름을 입력하세요."
          ~~~
        + textColorHint
        + inputType
          + 입력하는 문자의 유형 지정
          ~~~
              android:inputType="text"
          ~~~
        + selectAllOnFocus
          + 선택할 때마다 전체 내용을 수정할 수 있도록 함
        + cursorVisible
          + 커서가 보일지 결정
        + editable
          + 문자열의 편집 가능을 설정
        + ellipsize
          + 입력한 내용의 생략할 부분을 설정
          + none, start, middle, end ...
     
      + 메서드
        + getSelectionStart()
          + 선택된 영역의 시작 위치를 반환
        + getSelectionEnd()
          + 선택된 영역의 끝 위치를 반환
        + setSelection()
          + 선택 영역을 지정
        + extendSelection()
          + 선택 영역을 확장
        + selectAll()
          + 전체 문자열 선택
        + getText()
      
      + 리스너
        + public void addTextChangedListener(TextWatcher watcher) 
          + 사용자 입력에 의해 바뀔떄마다 확인하는 기능
        + TextWatcher 인터페이스
          + void beforeTextChanged(CharSequence s, int start, int count, int after)
          + void afterTextChanged(Editable s)
          + void onTextChanged(CharSequence s, int start, int before, int count)
    
    - ImageView & ImageButton
      + 두 위젯간 차이점
        버튼처럼 사용할 수 있는가 없는가 
      + 속성
        + src, srcCompat
          + 원본 이미지를 설정
          + JPG or PNG
          ~~~
              android:srcCompat="@drawable/person"
              or
              android:src="@drawable/person"
              or
              android:background="@drawable/person"
          ~~~
        + maxWidth, maxHeight
          + 이미지가 표시되는 최대 폭, 높이를 설정
          ~~~
              android:maxWidth="100dp"
              android:maxHeight="100dp"
          ~~~
        + tint
          + 보이는 이미지의 색상을 설정
          + 포멧은 #AARRGGBB
          ~~~
              android:tint="#AAAAAAAA"
          ~~~
        + scaleType
          + 이미지 뷰의 크기에 맞게 원본 이미지를 자동으로 늘리거나 줄여서 보여줄 것인가를 설정
          + fitXY, centerCrop, centerInside .... 
          ~~~
              android:scaleType="centerCrop"
          ~~~

          
  * 이벤트 처리 이해
    - 처리방식 이해
    - 이벤트 종류
    - 처리하기
    
  * 토스트
  * 스낵바
  * 대화상자
  * 프로그레스바
  </details>



# 선택 위젯
  <details>
  <summary> 목록 </summary>
  
  * 나인패치 이미지
  * 커스텀 뷰
  * 카드뷰
  * 리싸이클러뷰
  * 스피너
  </details>



# 다양한 위젯
  <details>
  <summary> 목록 </summary>
  
  * 앱 화면에 웹 브라우저 넣기
  * 시크바
  * 키패드
  </details>



# 드로어블
  <details>
  <summary> 목록 </summary>
  
  * 드로어블
    - 설명
      + 드로어블은 뷰에 설정할 수 있는 객체를 의미함
      + 상태에 따라 그래픽이나 이미지가 선택적으로 보이게 해줌
    - 종류 & 설명
      |드로어블 | 설명|
      | -- | -- |
      |BitmapDrawable |이미지 파일을 보여줄 때 사용 <br/> 비트맵 그래픽 파일을 사용해서 생성|
      |StateListDrawable|상태별로 다른 비트맵 그래픽 참조|
      |TransitionDrawable|두 개의 드로어블을 서로 전환할 수 있음|
      |ShapeDrawable|색상과 그러데이션을 포함하여 도형 모양을 정의할 수 있음|
      |InsetDrawalbe|지정된 거리만큼 다른 드로어블을 들어서 보여줄 수 있음|
      |ClipDrawable|레벨 값을 기준으로 다른 드로어블을 클리핑할 수 있음|
      |ScaleDrawalbe|레벨 값을 기준으로 다른 드로어블의 크기를 변경할 수 있음|
    - drawable 사용법
      + 이미지를 나타내려면 /app/res/drawable에 먼저 저장해야 됨
      + 해상도에 따라 포더를 구분해야 됨
        + 초고해상도 > dawable-xhdpi, dawable-xxhdpi, dawable-xxxhdpi
        + 고해상도 > dawable-hdpi
        + 중간해상도 > dawable-mdpi
        + 저해상도 > dawable-Idli
    - ShapeDrawalbe
      ~~~
        <?xml version="1.0" encoding="utf-8"?>
        <shape xmlns:android="http://schemas.android.com/apk/res/android"android:shape="rectangle">
            <size android:width="200dp" android:height="120dp"/>
            <stroke android:width="1dp" android:color="#0000ff"/>
            <solid android:color="#aaddff" />
            <padding android:bottom="1dp" />
        </shape>
        
        <shape xmlns:android="http://schemas.android.com/apk/res/android">
            <gradient
                android:startColor="#7288DB"
                android:centerColor="#3250B4"
                android:endColor="#254095"
                android:angle="90"
                android:centerY="0.5"
                />
            <corners android:radius="2dp" />
        </shape>
      ~~~
  </details>



# 화면 전환
  <details>
  <summary> 목록 </summary>
  
  * 레이아웃 인플레이션 이해
  * 다수의 화면 만들고, 화면간 전환하기
  * 인텐트
  * 플래그와 부가 데이터
  * 태스크 관리
  * 액비티시 수명주기
  * SharedPreferences
  </details>
  
  
  
# 프래그먼트
  <details>
  <summary> 목록 </summary>
  
  * 프래그먼트
  * 액션바
  * 상단 탭
  * 하단 탭
  * 뷰페이저
  * 바로가기 메뉴
  </details>
  
  
  
# 서비스와 수신자
  <details>
  <summary> 목록 </summary>
  
  * 서비스
  * 브로드캐스트 수신자
  * 위험 권한 부여
  * 리소스와 매니페스트
  * 그래들
  </details>
  
  
  
# 애니메이션
  <details>
  <summary> 목록 </summary>
  
  * 애니메이션
  * 페이지 슬라이딩
  </details>
  
  
  
# 쓰레드와 핸들러
  <details>
  <summary> 목록 </summary>
  
  * 핸들러
  * 일정 시간 후 실행
  * 쓰레드로 메시지 전송
  * AsyncTask
  * 쓰레드로 애니메이션
  </details>
  
  
  
# 서버 데이터 요청, 응답받기
  <details>
  <summary> 목록 </summary>
  
  * 네트워킹
  * 소켓 사용
  * 웹으로 요청
  * Volley 
  * JSON 데이터 다루기
  * 영화 정보 가져오기
  </details>
  
  
  
# 단말에 DB, 내용 제공자 만들기
  <details>
  <summary> 목록 </summary>
  
  * 모바일 DB란
  * DB와 테이블 만들기
  * 헬퍼 클래스로 업그레이드 지원
  * 데이터 조회
  * 내용 제공자
  * 앨범과 연락처 조회
  </details>
  
  
  
# 그래픽
  <details>
  <summary> 목록 </summary>
  
  * 뷰에 그래픽 그리기
  * 드로어블 객체로 만들어 그리기
  * 비트맵 이미지 사용
  * 페인트보드 
  * 멀티터치 이미지 뷰어
  * 머티리얼 디자인
  </details>
  
  
  
# 멀티미디어
  <details>
  <summary> 목록 </summary>
  
  * 카메라로 사진 찍어 저장
  * 화면에 카메라 미리보기 넣기
  * 음악 파일 재생
  * 동영상 재생
  * 오디오 녹음하여 저장
  * 동영상 녹화
  * 유튜브 영상 재생
  </details>
  
  
  
# 위치기반 서비스
  <details>
  <summary> 목록 </summary>
  
  * GPS로 내 위치 확인
  * 현재 위치 지도로 보여주기
  * 지도에 아이콘 추가
  </details>
  
  
  
# 앱 위젯
  <details>
  <summary> 목록 </summary>
  
  * 앱위젯
  </details>
  
  
  
# 푸시 서비스
  <details>
  <summary> 목록 </summary>
  
  * 진동과 소리로 알려주기
  * 상단 알림으로 알려주기
  * 푸시 서비스
  </details>
  
  
  
# 센서 및 단말 기능 사용
  <details>
  <summary> 목록 </summary>
  
  * 센서
  * 시스템 서비스
  * 네트워크 기능 활용
  * 다중 창 지원
  </details>
