package com.cadastrocarros.CarrosCadastro.cars;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarModel, Long> {
}
