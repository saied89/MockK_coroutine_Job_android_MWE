package android.saied.com.myapplication

import io.mockk.*
import kotlinx.coroutines.Job
import org.junit.Assert.*
import org.junit.Test

class SubjectInstrumentationTest {

    @Test
    fun methodTest() {
        val subject = mockk<Subject> {
            every { method() } returns Job()
        }
        subject.method()

        verify(exactly = 1) {
            subject.method()
        }
    }

}