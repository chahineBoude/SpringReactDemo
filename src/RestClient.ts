export class RestClient {
  static baseUrl = "http://localhost:8080";

  static async getMobileSuits(): Promise<any> {
    const url = `${RestClient.baseUrl}/gundam/MobileSuits`;
    const response = await fetch(url);
    return await response.json();
  }

  static async getMobileSuit(id: number): Promise<any> {
    const url = `${RestClient.baseUrl}/gundam/MobileSuits/${id}`;
    const response = await fetch(url);
    return await response.json();
  }

  static async getMsByUniverse(universe: string): Promise<any> {
    const url = `${RestClient.baseUrl}/gundam/MobileSuits/universe/${universe}`;
    const response = await fetch(url);
    return await response.json();
  }
}
