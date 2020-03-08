let matrix1 = [
    [2, 3, 4],
    [1, 6, 4],
    [9, 8, 4],
]

let matrix2 = [
    [8, 3, 2],
    [1, 8, 4],
    [3, 5, 1],
]

let result = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0],
]


for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        for (let k = 0; k < 3; k++) {
            result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
        document.write('hello')
    }
}


// console.log(result);

// console.log(matrix1, matrix2, result);

