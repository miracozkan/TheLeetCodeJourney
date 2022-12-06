package solutions

import core.Executable

class RemoveLetterToEqualizeFrequency : Executable<String, Boolean> {

    override fun invoke(args: String): Boolean {
        return with(args.groupingBy { it }.eachCount().toMutableMap()) {
            val (maxKey, maxValue) = maxByOrNull { it.value } ?: return false
            this[maxKey] = maxValue.dec()
            values.filter { it != 0 }.toSet().size == 1
        }
    }
}
