INSERT INTO role (name)
VALUES ('Docente'),
       ('Aluno');

INSERT INTO user (email, name, password, user_role)
values
    ('joao@gmail.com','João','123',2),
    ('maria@gmail.com','Maria','123',2),
    ('rui@gmail.com','Rui','123',2),

    ('antonio@gmail.com','António','123',1),
    ('patricia@gmail.com','Patrícia','123',1);

insert into participation (name, description)
values
    ('Autonomia','Capacidade do aluno de trabalhar por conta própria'),
    ('Comportamento','Se o aluno tem uma boa postura durante as aulas'),
    ('Intervenções','Se as intervenções do aluno são corretas'),
    ('Participação','Se o aluno intrevem de forma construtiva durante a aula');

insert into curricular_unit (name, teacher_id)
values
    ('Física', 4),
    ('Matemática', 5);

insert into classes (summary, date_time, curricular_unit_id)
values
    ('Exercicios', '2024-12-15 10:00:00', 1),
    ('Exercicios', '2024-11-22 14:00:00', 2),
    ('Apresentação', '2024-8-18 09:00:00', 1);

insert into attendance (state, class_id, user_id)
values
    (true, 1, 1),
    (true, 2, 1),
    (false, 3, 1),
    (true, 1, 2),
    (false, 2, 2),
    (false, 3, 2),
    (true, 1, 3),
    (true, 2, 3),
    (true, 3, 3);