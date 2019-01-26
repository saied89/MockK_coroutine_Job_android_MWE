package android.saied.com.myapplication

import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.Job
import org.junit.Assert.*
import org.junit.Test

class SubjectInstrumentationTest {

    @Test
    fun methodTest() {
        val subject = mockk<Subject> {
            coEvery { method() } returns Job()
        }
        subject.method()

        coVerify(exactly = 1) {
            subject.method()
        }
    }

}