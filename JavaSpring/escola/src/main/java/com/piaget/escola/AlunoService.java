package com.piaget.escola;


@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }



}
