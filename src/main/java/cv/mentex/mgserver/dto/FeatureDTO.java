package cv.mentex.mgserver.dto;

import jakarta.validation.constraints.NotBlank;

public class FeatureDTO {
    @NotBlank
    private String titulo;
    @NotBlank
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
