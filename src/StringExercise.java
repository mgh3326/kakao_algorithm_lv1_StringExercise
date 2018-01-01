class StringExercise {
    String getMiddle(String word) {
        if (word.length() % 2 == 1)//홀수 일 경우
        {
            return word.substring(word.length() / 2, word.length() / 2 + 1);
            //return Character.toString((word.charAt(word.length()/2)));
        } else {
            return word.substring(word.length() / 2-1, word.length() / 2 + 1);
            //return Character.toString((word.charAt(word.length()/2-1))) + Character.toString((word.charAt(word.length()/2)));
        }
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power1"));
    }
}