/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core;

/**
 * 用于管理别名的通用界面。 作为超级接口：
 * Common interface for managing aliases. Serves as super-interface for
 * {@link org.springframework.beans.factory.support.BeanDefinitionRegistry}.
 *
 * @author Juergen Hoeller
 * @since 2.5.2
 */
public interface AliasRegistry {

	/**
	 * 给定名称,为其注册别名：
	 * Given a name, register an alias for it.
	 * @param name 命名规范名称   the canonical name
	 * @param alias 要注册的别名  the alias to be registered
	 * @throws 如果这个别名已经被使用,产生IllegalStateException异常  IllegalStateException if the alias is already in use
	 * 并且可能不会被覆盖  and may not be overridden
	 */
	void registerAlias(String name, String alias);

	/**
	 * 从此注册表中删除指定的别名 Remove the specified alias from this registry.
	 * @param alias 要删除的别名  the alias to remove
	 * @throws 如果没有找到这样的别名,产生IllegalStateException异常  IllegalStateException if no such alias was found
	 */
	void removeAlias(String alias);

	/** 
	 * 确定此给定名称是否定义为别名  Determine whether this given name is defines as an alias
	 * (而不是实际注册的组件的名称  as opposed to the name of an actually registered component).
	 * @param name 要检查的名称 the name to check
	 * @return 给定的名称是否为别名 whether the given name is an alias
	 */
	boolean isAlias(String name);

	/**
	 * 如果已定义，则返回给定的别名 Return the aliases for the given name, if defined.
	 * @param name 要检查的别名名称 the name to check for aliases
	 * @return 别名，如果没有返回空数组  the aliases, or an empty array if none
	 */
	String[] getAliases(String name);

}
