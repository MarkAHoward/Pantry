open class Pantry() {
    private val items = mutableMapOf<String, Int>()

    // A Function to add an item to the Pantry
    open fun addItem() {
        print("Please enter the item name: ")
        val item = readLine()!!
        print("Please enter the amount you have: ")
        val amount = readLine()!!
        items[item] = amount.toInt()
    }

    // A Function to remove an item from the Pantry
    open fun removeItem() {
        print("Please enter the item name: ")
        val item = readLine()!!
        if (item in items) {
            items.remove(item)
            return
        } else {
            return
        }
    }

    // A Function to update how much of an item you have
    open fun updateAmount() {
        print("Please enter the item name: ")
        val item = readLine()!!
        if (item in items) {
            print("\n Please enter the new amount: ")
            val amount = readLine()!!
            items[item] = amount.toInt()
            return
        } else {
            return
        }
    }

    // A Function to show what is in the pantry
    open fun showMap() {
        println(items)
    }

    // A function to create a list of everything you have run out of
    open fun createShoppingList() {
        for (key in items.keys) {
            if (items[key]!! < 1) {
                println(key)
            }
        }
    }
}

fun main() {
    val pantry = Pantry()

    println("Welcome to your virtual Pantry!")
    println("Here you can keep track of everything you have in your house and see what you are missing.")
    val display = ( "Please choose an option: \n" +
                    "1. Display Pantry\n" +
                    "2. Add an item to Pantry\n" +
                    "3. Adjust the amount of an item in the Pantry\n" +
                    "4. Remove an item from the Pantry\n" +
                    "5. Generate Shopping List\n" +
                    "6. Exit")
    var exit = false
    while(!exit) {
        println(display)
        var response = readLine()!!
        when (response) {
            "1"   ->  pantry.showMap()
            "2"   ->  pantry.addItem()
            "3"   ->  pantry.updateAmount()
            "4"   ->  pantry.removeItem()
            "5"   ->  pantry.createShoppingList()
            "6"   ->  exit = true
        }
    }
}


