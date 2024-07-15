package alura.foro_hub.domain.topico;

public record DatosActualizarTopico(
    String autor,
    String mensaje,
    String nombreCurso,
    String titulo,
    Estado estatus

) {
}
