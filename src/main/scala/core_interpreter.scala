import org.hypergraphdb._

object core_interpreter {
    def main(args: Array[String]) = {
        val db_location = "./db"
        val graph = new HyperGraph(db_location)

        val handle = graph.add("hello")
        println(handle)

        println(graph.get(handle))

        graph.close
        println ("end")
    }
}
