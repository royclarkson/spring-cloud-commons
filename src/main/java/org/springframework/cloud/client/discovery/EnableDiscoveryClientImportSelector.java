package org.springframework.cloud.client.discovery;

import org.springframework.cloud.client.SingleImplementationImportSelector;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author Spencer Gibb
 */
@Order(Ordered.LOWEST_PRECEDENCE - 100)
public class EnableDiscoveryClientImportSelector extends SingleImplementationImportSelector<EnableDiscoveryClient> {

}
