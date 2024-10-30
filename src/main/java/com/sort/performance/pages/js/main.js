async function fetchSortingTimes() {
    try {
        // Bubble Sort
        const bubbleSortResponse = await fetch('http://localhost:8085/api/bubblesort/sort', { mode: "cors", cache: "no-store" });
        if(!bubbleSortResponse.ok){
            throw new Error(bubbleSortResponse.status);
        }
        const bubbleSortTime = await bubbleSortResponse.json();
        document.getElementById('bubbleSortTime').innerText = `${bubbleSortTime.sortTime} ms`

        // Quick Sort
        const quickSortResponse = await fetch('http://localhost:8085/api/quicksort/sort', { mode: "cors", cache: "no-store" });
        if (!quickSortResponse.ok) {
            throw new Error(quickSortResponse.status);
        }
        const quickSortTime = await quickSortResponse.json();
        document.getElementById('quickSortTime').innerText = `${quickSortTime.sortTime} ms`;

        // Merge Sort
        const mergeSortResponse = await fetch('http://localhost:8085/api/mergesort/sort', {mode: "cors", cache: "no-store" });
        if (!mergeSortResponse.ok) {
            throw new Error(mergeSortResponse.status);
        }
        const mergeSortTime = await mergeSortResponse.json();
        document.getElementById('mergeSortTime').innerText = `${mergeSortTime.sortTime} ms`;

    } catch (error) {
        console.error('Erro ao buscar os tempos de ordenação:', error);
        document.getElementById('bubbleSortTime').innerText = "Erro ao buscar o tempo.";
        document.getElementById('quickSortTime').innerText = "Erro ao buscar o tempo.";
        document.getElementById('mergeSortTime').innerText = "Erro ao buscar o tempo.";
    }
    
}

document.addEventListener("DOMContentLoaded", () => {
        fetchSortingTimes();
    });


