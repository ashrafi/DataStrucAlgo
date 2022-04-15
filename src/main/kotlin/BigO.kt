class BigO {

    /**
     * To meaningfully compare algorithmic performance, we can use big O notation – sometimes referred to as “order of growth.”
     * In short, it compares the asymptotic behavior of algorithms; that is, how does their performance scale as a function of the input size?
     */

    /**
     * O(1)
     * An algorithm that will always execute in the same time (or space) regardless of the size of the input data set.
     */

    fun isFirstElementNull(list: List<String?>) = list[0]==null

    /**
     * O(n)
     * An algorithm whose performance will grow linearly and in direct proportion to the size of the input data set.
     * Big O favors the worst-case performance scenario.
     */


    // Big O favours the worst-case performance scenario
    fun containsValue(list: List<String>, value: String): Boolean {
        list.forEach { it ->
            if (it == value) return true
        }
        return false
    }


}