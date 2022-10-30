##2번 문제 : 괴짜 브라운의 중복을 이용한 암호

###구현 기능

1. 계산 전 예외 처리 
   
    -길이가 1-1000 사이인가? 
   
    -알파벳 소문자 이외의 문자가 존재하는가?(공백,숫자,대문자,알파벳 외의 문자)

2. 연속하는 중복 문자들을 삭제

###실행 순서

1. 문자열의 시작 길이를 기록한다
2. 문자열의 문자를 하나하나씩 큐에 넣는다
3. 중복된 문자일 경우 큐에 넣는다
4. 중복된 문자가 아닐 경우 큐에 중복된 문자가 있을시 큐에있는 문자들을 버린다
5. 중복된 문자가 없을시 새로운 문자열에 쓴다
6. 변환된 문자열의 길이를 1에서 얻은 길이와 비교한다
7. 변환전 문자열의 길이와 변환후 문자열의 길이가 같을 때까지 1에서6까지 반복한다