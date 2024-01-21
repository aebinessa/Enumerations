fun main() {
    val abdullah = UserRole.VIEWER
    abdullah.checkAccessLevel(10)
    abdullah.checkAccessLevel(5)
    abdullah.checkAccessLevel(0)
    
}

enum class UserRole(val accessLevel: Int) {
    ADMIN(10), EDITOR(5), VIEWER(0);

    fun checkAccessLevel(requiredAccessLevel: Int) {
        when (requiredAccessLevel) {
            0 -> println("Your access level status is viewer")
            5 -> println("Your access level status is editor")
            10 -> println("Your access level status is admin")
            else -> {
                println("Not a valid access level")
            }
        }
    }
}