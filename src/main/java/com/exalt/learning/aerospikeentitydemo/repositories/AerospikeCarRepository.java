package com.exalt.learning.aerospikeentitydemo.repositories;

import com.exalt.learning.aerospikeentitydemo.entities.CarEntity;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface AerospikeCarRepository extends AerospikeRepository<CarEntity, Integer> {
}
