package com.company;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;


@Slf4j
public class Main {

    private static final int THREADS_NUM_POWER = 8;
    private static final int MEASUREMENT_COUNT = 8;

    private static final int CPU_BOUND_OP_PI_DIGITS = 4096;
    private static final String CPU_BOUND_OP_RESULT_FILE_PATH = "./res/cpu-bound.json";

    private static final String IO_BOUND_OP_INPUT_FILE_PATH = "./io-bound/enwik9";
    private static final String IO_BOUND_OP_OUTPUT_FILE_PATH = "./io-bound/enwik9-out";
    private static final String IO_BOUND_OP_RESULT_FILE_PATH = "./res/io-bound.json";

    private static final int MEMORY_BOUND_OP_ALLOC_BYTES = 32_000_000; // 32 Mb
    private static final String MEMORY_BOUND_OP_RESULT_FILE_PATH = "./res/memory-bound.json";


}
