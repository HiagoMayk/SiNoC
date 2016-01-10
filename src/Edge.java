public class Edge  
{
	private final String id;			// Id da aresta
	private final Vertex source;		// Vértice de origem
	private final Vertex destination;	// Vértice de destino
	private final int weight;			// Peso da aresta
  
	public Edge(String id, Vertex source, Vertex destination, int weight) 
	{
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
  
	/*
	 * retorna o id da aresta
	 */
	public String getId()
	{
		return id;
	}
	
	/*
	 * retorna o vértice de origem
	 */
	public Vertex getSource() 
	{
		return source;
	}
	
	/*
	 * retorna o vértice de destino
	 */
	public Vertex getDestination()
	{
		return destination;
	}
	
	/*
	 * returna o peso da aresta
	 */
	public int getWeight()
	{
		return weight;
	}
  
	/*
	 * retorna uma string contendo o vértice de origem e o de destino
	 */
	@Override
	public String toString() 
	{
		return source + " " + destination;
	}
}