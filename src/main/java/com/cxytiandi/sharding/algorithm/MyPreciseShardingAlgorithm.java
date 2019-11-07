package com.cxytiandi.sharding.algorithm;

import java.util.Collection;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Service;
import java.util.Collection;

/**
 * 自定义分片算法
 *
 * @author yinjihuan
 *
 */
@Service
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
		String dbName = "ds";
		Long val = shardingValue.getValue();
		dbName += val;
		System.out.println(dbName);
		for (String each : availableTargetNames) {
			if (each.equals(dbName)) {
				return each;
			}
		}
		throw new IllegalArgumentException();
	}

}

