//resource "google_compute_firewall" "default" {
//  name = "devsecops-fw-all"
//  network = "devsecops-network-gcp"
//
//  allow {
//    protocol = "all"
//  }
//
//  description = "INGRESS"
//  source_ranges = [
//    "0.0.0.0/0"]
//}

//resource "google_compute_firewall" "i04-ni-gcp" {
//  name = "devsecops-fw-single-port"
//  network = "devsecops-network-gcp"
//
//  allow {
//    protocol = "tcp"
//    ports = [
//      "389"]
//  }
//  allow {
//    protocol = "udp"
//    ports = [
//      "389"]
//  }
//
//  description = "INGRESS"
//  source_ranges = [
//    "0.0.0.0/0"]
//}
//
//
//resource "google_compute_firewall" "i05-06-ni-gcp" {
//  name = "devsecops-fw-multi-ports"
//  network = "devsecops-network-gcp"
//
//  allow {
//    protocol = "tcp"
//    ports = [
//      "3020-3050",
//      "9000"]
//  }
//  allow {
//    protocol = "udp"
//    ports = [
//      "3020-3050",
//      "9000"]
//  }
//
//  description = "INGRESS"
//  source_ranges = [
//    "0.0.0.0/0"]
//}
//
//
//resource "google_compute_firewall" "i14-ni-gcp" {
//  name = "devsecops-fw-single-ip"
//  network = "devsecops-network-gcp"
//
//  allow {
//    protocol = "tcp"
//    ports = [
//      "135",
//      "139",
//      "445",
//      "593"]
//  }
//
//  description = "INGRESS"
//  source_ranges = [
//    "192.168.1.1/32"]
//}
//
//resource "google_compute_firewall" "i23-ni-gcp" {
//  name = "devsecops-fw-multi-ip"
//  network = "devsecops-network-gcp"
//
//  allow {
//    protocol = "udp"
//    ports = [
//      "137",
//      "138"]
//  }
//
//  description = "INGRESS"
//  source_ranges = [
//    "192.168.1.1/32",
//    "192.168.1.2/32",
//    "192.168.1.3/32",
//    "192.168.1.4/32",
//    "192.168.1.5/32"]
//}
//
//resource "google_compute_firewall" "i21-ni-gcp" {
//  name = "devsecops-fw-cidr-ip"
//  network = "devsecops-network-gcp"
//
//  allow {
//    protocol = "tcp"
//    ports = [
//      "22"]
//  }
//
//  description = "INGRESS"
//  source_ranges = [
//    "192.168.0.0/16"]
//}