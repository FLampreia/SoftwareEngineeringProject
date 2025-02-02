package pt.estgd.api.domain;

import jakarta.persistence.*;

public enum ParticipationType {
    AUTONOMIA("Autonomia", "Capacidade do aluno de tomar iniciativas e resolver problemas sem depender constantemente do professor"),
    COMPORTAMENTO("Comportamento", "Atitude e respeito do aluno em relação ao professor e aos colegas durante as aulas"),
    INTERVENCOES("Intervenções", "Qualidade e pertinência das contribuições do aluno nas discussões em aula"),
    PARTICIPACAO("Participação", "Presença do aluno nas atividades e discussões de forma ativa e colaborativa"),
    CRIATIVIDADE("Criatividade", "Capacidade do aluno de apresentar ideias originais e soluções inovadoras durante as atividades");

    private String participation;
    private String description;

    ParticipationType(String participation, String description) {
        this.participation = participation;
        this.description = description;
    }

    public String getParticipation() {
        return participation;
    }

    public String getDescription() {
        return description;
    }
}
