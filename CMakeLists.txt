cmake_minimum_required (VERSION 2.6)
project (AADS)

find_package(OpenGL)
find_package(GLUT)
find_package(GLEW)

aux_source_directory(. SRC_LIST)
MESSAGE( STATUS ${SRC_LIST})
file(GLOB SOURCES ${CMAKE_CURRENT_LIST_DIR} *.h)
MESSAGE( STATUS ${SOURCES})
add_executable(${PROJECT_NAME} ${SRC_LIST} ${SOURCES})


target_link_libraries(
    ${PROJECT_NAME}
    ${OPENGL_gl_LIBRARY}
    ${GLUT_LIBRARIES} 
    ${GLEW_LIBRARIES})
set (CMAKE_CXX_STANDARD 11)
