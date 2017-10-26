/*
 * Copyright 2017 JiaweiMao jiaweiM_philo@hotmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.jdk.lang;

import org.junit.jupiter.api.Test;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 20 Oct 2017, 4:07 PM
 */
public class HashTest
{

    private Integer key;
    private String name;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashTest hashTest = (HashTest) o;

        if (key != null ? !key.equals(hashTest.key) : hashTest.key != null) return false;
        return name != null ? name.equals(hashTest.name) : hashTest.name == null;
    }

    @Override
    public int hashCode()
    {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Test
    public void test(){

    }

}
