/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fernandocejas.android10.sample.domain

/**
 * Class that represents a User in the domain layer.
 */
class User(val userId: Int) {

    var coverUrl: String? = null
    var fullName: String? = null
    var email: String? = null
    var description: String? = null
    var followers: Int = 0

    override fun toString(): String {
        val stringBuilder = StringBuilder()

        stringBuilder.append("***** User Details *****\n")
        stringBuilder.append("id=" + this.userId + "\n")
        stringBuilder.append("cover url=" + this.coverUrl + "\n")
        stringBuilder.append("fullname=" + this.fullName + "\n")
        stringBuilder.append("email=" + this.email + "\n")
        stringBuilder.append("description=" + this.description + "\n")
        stringBuilder.append("followers=" + this.followers + "\n")
        stringBuilder.append("*******************************")

        return stringBuilder.toString()
    }
}
