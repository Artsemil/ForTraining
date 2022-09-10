resource "google_compute_firewall" "i05-06-ni-gcp" {
  name = "devsecops-fw-multi-ports"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "3020-3050",
      "9000"]
  }
  allow {
    protocol = "udp"
    ports = [
      "3020-3050",
      "9000"]
  }

  description = "INGRESS"
  priority = 1200
  source_ranges = [
    "0.0.0.0/0"]
}