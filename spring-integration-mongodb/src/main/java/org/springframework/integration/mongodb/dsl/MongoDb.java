/*
 * Copyright 2016-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.mongodb.dsl;

import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.convert.MongoConverter;

/**
 * Factory class for building MongoDb components
 *
 * @author Xavier Padro
 *
 * @since 5.0
 */
public final class MongoDb {

	/**
	 * Create a {@link MongoDbOutboundGatewaySpec} builder instance
	 * based on the provided {@link MongoDatabaseFactory} and {@link MongoConverter}.
	 * @param mongoDbFactory the {@link MongoDatabaseFactory} to use.
	 * @param mongoConverter the {@link MongoConverter} to use.
	 * @return the {@link MongoDbOutboundGatewaySpec} instance
	 */
	public static MongoDbOutboundGatewaySpec outboundGateway(
			MongoDatabaseFactory mongoDbFactory, MongoConverter mongoConverter) {

		return new MongoDbOutboundGatewaySpec(mongoDbFactory, mongoConverter);
	}

	/**
	 * Create a {@link MongoDbOutboundGatewaySpec} builder instance
	 * based on the provided {@link MongoOperations}.
	 * @param mongoTemplate the {@link MongoOperations} to use.
	 * @return the {@link MongoDbOutboundGatewaySpec} instance
	 */
	public static MongoDbOutboundGatewaySpec outboundGateway(MongoOperations mongoTemplate) {
		return new MongoDbOutboundGatewaySpec(mongoTemplate);
	}

	private MongoDb() {
	}

}
