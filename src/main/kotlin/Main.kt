import Sort.*
import java.util.*
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import DataStructures.*
import Graph.*

fun main(args: Array<String>) {

    testGraph()

}

fun <T: Comparable<T>> execTimeSorts(array: Array<T>) {

    val BubbleTime = measureNanoTime{//measureTimeMillis {
        val sorted = bubbleSort(array)
    }
    print("BubbleSort time is: $BubbleTime\n")

    val InsertionTime = measureNanoTime{//measureTimeMillis {
        val sorted = insertionSort(array)
    }
    print("InsertionSort time is: $InsertionTime\n")

    val MergeTime = measureNanoTime{//measureTimeMillis {
        val sorted = mergeSort(array, 0, array.size-1)
    }
    print("MergeSort time is: $MergeTime\n")

    val SelectionTime = measureNanoTime{//measureTimeMillis {
        val sorted = selectionSort(array)
    }
    print("SelectionSort time is: $SelectionTime\n")

    val QuickTime = measureNanoTime{//measureTimeMillis {
        val sorted = quickSort(array, 0, array.size-1)
    }
    print("QuickSort time is: $QuickTime\n")

    val BuiltinTime = measureNanoTime{//measureTimeMillis {
        val sorted = array.sort()
    }
    print("BuiltinSort time is: $BuiltinTime\n")
}

fun <T: Comparable<T>> execTimeBinarySearch(array: Array<T>) {
    /*val indexOfTime = measureNanoTime{//measureTimeMillis {
        val search31 = array.indexOf(31)
    }
    print("indexOf time is: $indexOfTime\n")*/

    val binarySearchTime = measureNanoTime{//measureTimeMillis {
        val binSearch31 = array.binarySearch(31)
    }
    print("binarySearch time is: $binarySearchTime\n")
}

fun testBinaryTree() {
    val zero = BinaryNode("A") //"A"
    val one = BinaryNode("B") //"B"
    val five = BinaryNode("C") //"C"
    val seven = BinaryNode("D") //"D"
    val eight = BinaryNode("E") //"E"
    val nine = BinaryNode("F") //"F"
    seven.leftChild = one
    one.leftChild = zero
    one.rightChild = five
    seven.rightChild = nine
    nine.leftChild = eight
    val tree = seven

    println(tree)
}

fun testGraph() {
    val graph = AdjacencyList<String>()

    val singapore = graph.createVertex("Singapore")
    val tokyo = graph.createVertex("Tokyo")
    val hongKong = graph.createVertex("Hong Kong")
    val detroit = graph.createVertex("Detroit")
    val sanFrancisco = graph.createVertex("San Francisco")
    val washingtonDC = graph.createVertex("Washington DC")
    val austinTexas = graph.createVertex("Austin Texas")
    val seattle = graph.createVertex("Seattle")
    val moscow = graph.createVertex("Moscow")
    graph.add(EdgeType.UNDIRECTED, singapore, hongKong, 300.0)
    graph.add(EdgeType.UNDIRECTED, singapore, tokyo, 500.0)
    graph.add(EdgeType.UNDIRECTED, hongKong, tokyo, 250.0)
    graph.add(EdgeType.UNDIRECTED, tokyo, detroit, 450.0)
    graph.add(EdgeType.UNDIRECTED, tokyo, washingtonDC, 300.0)
    graph.add(EdgeType.UNDIRECTED, hongKong, sanFrancisco, 600.0)
    graph.add(EdgeType.UNDIRECTED, detroit, austinTexas, 50.0)
    graph.add(EdgeType.UNDIRECTED, austinTexas, washingtonDC, 292.0)
    graph.add(EdgeType.UNDIRECTED, sanFrancisco, washingtonDC, 337.0)
    graph.add(EdgeType.UNDIRECTED, washingtonDC, seattle, 277.0)
    graph.add(EdgeType.UNDIRECTED, sanFrancisco, seattle, 218.0)
    graph.add(EdgeType.UNDIRECTED, austinTexas, sanFrancisco, 297.0)
    println(graph)

    val vertices = graph.BFS(tokyo)
    vertices.forEach {
        println(it.data)
    }
    println(graph.isDisconnected())

}