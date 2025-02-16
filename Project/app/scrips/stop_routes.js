const maximo = 17
for (let i=1; i<=maximo; i++){
    let n=5
    for (let j=(i+1); j<=maximo; j++){
      n=n+5
      console.log(`('${i}', '${j}', NULL, '${n}', '${n}', '${n}'),`)
    }
}