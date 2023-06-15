package Graph

import DataStructures.*

data class Vertex<T>(val index: Int, val data: T)

data class Edge<T>(
    val source: Vertex<T>,
    val destination: Vertex<T>,
    val weight: Double? = null
)

interface Graph<T> {
    abstract val allVertices: ArrayList<Vertex<T>>
    fun createVertex(data: T): Vertex<T>
    fun addDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?)
    fun addUndirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?)
    fun add(edge: EdgeType, source: Vertex<T>, destination: Vertex<T>, weight: Double?)
    fun edges(source: Vertex<T>): ArrayList<Edge<T>>
    fun weight(source: Vertex<T>, destination: Vertex<T>): Double?
    fun BFS(source: Vertex<T>): ArrayList<Vertex<T>> {
        val queue = ArrayListQueue<Vertex<T>>()
        val enqueued = ArrayList<Vertex<T>>()
        val visited = ArrayList<Vertex<T>>()

        queue.enqueue(source)
        enqueued.add(source)

        while (true) {
            val vertex = queue.dequeue() ?: break
            visited.add(vertex)
            val neighborEdges = edges(vertex)
            neighborEdges.forEach {
                if (!enqueued.contains(it.destination)) {
                    queue.enqueue(it.destination)
                    enqueued.add(it.destination)
                }
            }
        }

        return visited
    }

    fun isDisconnected(): Boolean {
        val firstVertex = allVertices.firstOrNull() ?: return false

        val visited = BFS(firstVertex)
        allVertices.forEach {
            if (!visited.contains(it)) return true
        }
        return false
    }

}
enum class EdgeType {
    DIRECTED,
    UNDIRECTED
}