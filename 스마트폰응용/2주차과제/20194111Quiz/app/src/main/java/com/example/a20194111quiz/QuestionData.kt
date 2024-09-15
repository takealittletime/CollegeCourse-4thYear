package com.example.a20194111quiz

object QuestionData {

    fun getQuestion(): ArrayList<Question>{

        val queList: ArrayList<Question> = arrayListOf()



        val q1 = Question(
            1,
            "못팔고도 돈 번 사람은?",
            "철물점 주인",
            "빵집 주인",
            "슈퍼마켓 주인",
            "편의점 주인",
            1
        )

        val q2 = Question(
            1,
            "도둑이 가장 싫어하는 아이스크림은? ",
            "바밤바",
            "스크류바",
            "비비빅",
            "누가바",
            4
        )

        val q3 = Question(
            1,
            "한국에서 가장 급하게 만든 떡은?",
            "가래떡",
            "쑥떡쑥떡",
            "헐레벌떡",
            "시루떡",
            3
        )

        val q4 = Question(
            1,
            "호주의 돈을 뭐라고 하는가?",
            "산와머니",
            "호주머니",
            "쇼미더머니",
            "오스트레일리아",
            2
        )

        val q5 = Question(
            1,
            "학생들이 싫어하는 피자는?",
            "하와이안 피자",
            "포테이토 피자",
            "책 피자",
            "페퍼로니 피자",
            3
        )

        val q6 = Question(
            1,
            " 도둑이 가장 좋아하는 아이스크림은? ",
            "보석바",
            "누가바",
            "바밤바",
            "비비빅",
            1
        )

        val q7 = Question(
            1,
            "바나나가 웃으면?",
            "나한테 반하나?",
            "바나나킥",
            "바나나는 원래 하얗다",
            "바나나맛우유",
            2
        )

        val q8 = Question(
            1,
            "왕이 넘어지면?",
            "킹덤",
            "왕릉",
            "킹콩",
            "왕관",
            3
        )

        val q9 = Question(
            1,
            "새우가 출연하는 드라마는?",
            "대하드라마",
            "금토드라마",
            "일일드라마",
            "사극드라마",
            1
        )

        val q10 = Question(
            1,
            "해가 우는 곳은? ",
            "해남",
            "해녀촌",
            "해삼",
            "해운대",
            4
        )

        queList.add(q1)
        queList.add(q2)
        queList.add(q3)
        queList.add(q4)
        queList.add(q5)
        queList.add(q6)
        queList.add(q7)
        queList.add(q8)
        queList.add(q9)
        queList.add(q10)

        return queList
    }
}