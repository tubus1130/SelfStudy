/*
1. 오직 key-value 들만 담을 수 있다.
2. 메소드는 담을 수 없다.
3. undefined는 불가하다.
4. 프로그래밍 언어와 플랫폼에 독립적이므로, 서로 다른 시스템간에 객체를 교환하기에 좋다.(주로 API, config파일에 활용되며 가볍다)
*/
const a = {
    "PLAYLIST" : [
        {
            "name" : "NEW JEANS",
            "song" : "DITTO",
            "rank" : 1
        },
        {
            "name" : "IZONE",
            "song" : "PANORAMA"
        }
    ]
}

console.log(a.PLAYLIST[0])
console.log(a.PLAYLIST[1])
console.log(a.PLAYLIST[0].name)

console.log(a.PLAYLIST[0]["song"])