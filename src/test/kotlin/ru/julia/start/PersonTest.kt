package ru.julia.start

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class PersonTest {

    @Test
    fun getName() {
        val john = Person(
            name = Name("John", "Smith"),
            address = Address(City("Springfield", "US"), "123 Fake Street"),
            ownsAPet = false
        )

        assertEquals("John", john.name.firstName)
        assertEquals("Smith", john.name.lastName)

        assertEquals("US", john.address.city.country)
        assertEquals("Springfield", john.address.city.town)
        assertEquals("123 Fake Street", john.address.street)

        assertFalse(john.ownsAPet)
    }
}