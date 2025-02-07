import { useState } from 'react';

const useHttpRequest = () => {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const sendRequest = async (method, url, params = {}, body = null) => {
    setLoading(true);
    setError(null);

    try {
      // Construir la URL con los parámetros (solo para GET)
      const queryString = method === 'GET' ? `?${new URLSearchParams(params).toString()}` : '';
      const fullUrl = `${url}${queryString}`;

      const options = {
        method,
        headers: {
          'Content-Type': 'application/json',
        },
        body: method !== 'GET' && body ? JSON.stringify(body) : null,
      };

      const response = await fetch(fullUrl, options);

      if (!response.ok) {
        throw new Error(`Error: ${response.status} - ${response.statusText}`);
      }

      const result = await response.json();
      setData(result);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  return { data, loading, error, sendRequest };
};

export default useHttpRequest;