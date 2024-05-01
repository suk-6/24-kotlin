fun main() {
    val suk: Contact = Contact(1, "me@suk.kr")
    val typidoyun: Contact = Contact(2, "typidoyun@gmail.com")
    val zerocode: Contact = Contact(3, null)

    println("도윤이의 이메일 ${typidoyun.email}")
    println("도윤이의 연락처 $typidoyun")

    if ((zerocode.email?.length ?: 0) > 1) {
        println(zerocode.email)
    } else {
        println("이메일이 없거나 길이가 1보다 작습니다.")
    }
}

data class Contact(private val id: Int, val email: String?) {
    override fun toString(): String {
        return "id는 $id, 이메일은 $email"
    }
}