// 각 객체는 다른 타입을 가지고 있어도 된다!
let a = `{
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
}`

a = JSON.parse(a)
console.log(a)