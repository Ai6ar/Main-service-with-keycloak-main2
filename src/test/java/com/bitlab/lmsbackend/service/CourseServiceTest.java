package com.bitlab.lmsbackend.service;

import com.bitlab.lmsbackend.dto.CourseDto;
import com.bitlab.lmsbackend.entity.Course;
import com.bitlab.lmsbackend.mapper.CourseMapper;
import com.bitlab.lmsbackend.repository.CourseRepository;
import org.junit.jupiter.api.*;
import org.mockito.*;
import java.util.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    @Mock
    private CourseRepository repo;
    @Mock
    private CourseMapper mapper;
    @InjectMocks
    private CourseService service;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreate() {
        CourseDto dto = CourseDto.builder().name("Test").description("Desc").build();
        Course entity = Course.builder().name("Test").description("Desc").build();
        when(mapper.toEntity(dto)).thenReturn(entity);
        Course saved = Course.builder().id(1L).name("Test").description("Desc").build();
        when(repo.save(any())).thenReturn(saved);
        when(mapper.toDto(saved)).thenReturn(CourseDto.builder().id(1L).name("Test").description("Desc").build());

        CourseDto result = service.createCourse(dto);
        assertNotNull(result);
        assertEquals(1L, result.getId());
        verify(repo).save(entity);
    }
}
