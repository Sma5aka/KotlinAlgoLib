import Sort.*
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class testTest{
    @Test
    fun testone(){
        assert(true)
    }
}

//Test for Build-in sort function
class buildinSortTest{
    @Test
    fun buildinSortTest1() {
        val array = arrayOf(8, 3, 4, 5, 1, 10)
        array.sort()
        assertArrayEquals(array, arrayOf(1, 3, 4, 5, 8, 10))
    }

    @Test
    fun buildinSortTest2(){
        val array = arrayOf("A", "D", "E", "F", "B", "C")
        array.sort()
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "E", "F"))
    }

    @Test
    fun buildinSortTest3(){
        val array = arrayOf(-100, -23, 12, 44, 101, -1, 0)
        array.sort()
        assertArrayEquals(array, arrayOf(-100, -23, -1, 0, 12, 44, 101))
    }

}

//Tests for BubbleSort function
class bubbleSortTest{
    @Test
    fun bubbleSortTest1(){
        val array = arrayOf(8, 3, 4, 5, 1, 10)
        bubbleSort(array)
        assertArrayEquals(array, arrayOf(1, 3, 4, 5, 8, 10))
    }

    @Test
    fun bubbleSortTest2(){
        val array = arrayOf("A", "D", "E", "F", "B", "C")
        bubbleSort(array)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "E", "F"))
    }

    @Test
    fun bubbleSortTest3(){
        val array = arrayOf(-100, -23, 12, 44, 101, -1, 0)
        bubbleSort(array)
        assertArrayEquals(array, arrayOf(-100, -23, -1, 0, 12, 44, 101))
    }

}

//Tests for InsertionSort function
class insertionSortTest{
    @Test
    fun insertionSortTest1(){
        val array = arrayOf(8, 3, 4, 5, 1, 10)
        insertionSort(array)
        assertArrayEquals(array, arrayOf(1, 3, 4, 5, 8, 10))
    }

    @Test
    fun insertionSortTest2(){
        val array = arrayOf("A", "D", "E", "F", "B", "C")
        insertionSort(array)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "E", "F"))
    }

    @Test
    fun insertionSortTest3(){
        val array = arrayOf(-100, -23, 12, 44, 101, -1, 0)
        insertionSort(array)
        assertArrayEquals(array, arrayOf(-100, -23, -1, 0, 12, 44, 101))
    }

}

//Tests for MergeSort function
class mergeSortTest{
    @Test
    fun mergeSortTest1(){
        val array = arrayOf(8, 3, 4, 5, 1, 10)
        mergeSort(array, 0, array.size-1)
        assertArrayEquals(array, arrayOf(1, 3, 4, 5, 8, 10))
    }

    @Test
    fun mergeSortTest2(){
        val array = arrayOf("A", "D", "E", "F", "B", "C")
        mergeSort(array, 0, array.size-1)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "E", "F"))
    }

    @Test
    fun mergeSortTest3(){
        val array = arrayOf(-100, -23, 12, 44, 101, -1, 0)
        mergeSort(array, 0, array.size-1)
        assertArrayEquals(array, arrayOf(-100, -23, -1, 0, 12, 44, 101))
    }

}

//Tests for QuickSort function
class quickSortTest{
    @Test
    fun quickSortTest1(){
        val array = arrayOf(8, 3, 4, 5, 1, 10)
        quickSort(array, 0, array.size-1)
        assertArrayEquals(array, arrayOf(1, 3, 4, 5, 8, 10))
    }

    @Test
    fun quickSortTest2(){
        val array = arrayOf("A", "D", "E", "F", "B", "C")
        quickSort(array, 0, array.size-1)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "E", "F"))
    }

    @Test
    fun quickSortTest3(){
        val array = arrayOf(-100, -23, 12, 44, 101, -1, 0)
        quickSort(array, 0, array.size-1)
        assertArrayEquals(array, arrayOf(-100, -23, -1, 0, 12, 44, 101))
    }

}

//Tests for SelectionSort function
class selectionSortTest{
    @Test
    fun selectionSortTest1(){
        val array = arrayOf(8, 3, 4, 5, 1, 10)
        selectionSort(array)
        assertArrayEquals(array, arrayOf(1, 3, 4, 5, 8, 10))
    }

    @Test
    fun selectionSortTest2(){
        val array = arrayOf("A", "D", "E", "F", "B", "C")
        selectionSort(array)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "E", "F"))
    }

    @Test
    fun selectionSortTest3(){
        val array = arrayOf(-100, -23, 12, 44, 101, -1, 0)
        selectionSort(array)
        assertArrayEquals(array, arrayOf(-100, -23, -1, 0, 12, 44, 101))
    }

}